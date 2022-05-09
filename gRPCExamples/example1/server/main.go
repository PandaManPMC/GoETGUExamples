package main

import (
	"example1server/pb"
	"example1server/service"
	"google.golang.org/grpc"
	"log"
	"net"
)

func main() {
	address := ":8081"
	tcp,err := net.Listen("tcp",address)
	if nil != err {
		log.Fatalf("listen err %v",err)
	}
	server := grpc.NewServer()
	pb.RegisterIdentityInfoServiceServer(server,new (service.IdentityInfoService))
	log.Printf("启动 grpc 服务端口 %s \n",address)
	err = server.Serve(tcp)
	if nil != err {
		log.Fatalf("启动 grpc 服务失败 %v",err)
	}
}