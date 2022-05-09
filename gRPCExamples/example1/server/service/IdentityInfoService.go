package service

import (
	"context"
	"example1server/pb"
	"google.golang.org/grpc/codes"
	"google.golang.org/grpc/status"
	"sync"
	"sync/atomic"
)

type IdentityInfoService struct {
	IdentityInfoMap map[int64] *pb.IdentityInfo
}

var lockAddIdentityInfo sync.Mutex
var id int64 = 0

//	AddIdentityInfo 实现 addIdentityInfo 记录 *proto.IdentityInfo
func (service *IdentityInfoService) AddIdentityInfo(ctx context.Context,in *pb.IdentityInfo) (*pb.IdentityInfoId,error){
	if nil == service.IdentityInfoMap {
		lockAddIdentityInfo.Lock()
		if nil == service.IdentityInfoMap {
			service.IdentityInfoMap = make(map[int64] *pb.IdentityInfo)
		}
		lockAddIdentityInfo.Unlock()
	}
	atomic.AddInt64(&id,1)
	service.IdentityInfoMap[id] = in
	return &pb.IdentityInfoId{Id: id},status.New(codes.OK,"").Err()
}

//	GetInfo 实现 getInfo 根据 *proto.IdentityInfoId 查询
func (service *IdentityInfoService) GetInfo(ctx context.Context,in *pb.IdentityInfoId) (*pb.IdentityInfo,error) {
	if nil == service.IdentityInfoMap {
		return nil,status.Errorf(codes.NotFound,"not found")
	}
	v,exists := service.IdentityInfoMap[in.Id]
	if exists {
		return v,nil
	}
	return nil,status.New(codes.NotFound,"not found").Err()
}