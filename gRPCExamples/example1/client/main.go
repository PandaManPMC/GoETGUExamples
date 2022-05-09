package main

import (
	"context"
	"example1client/pb"
	"google.golang.org/grpc"
	"google.golang.org/grpc/credentials/insecure"
	"log"
	"time"
)

func main() {
	conn, err := grpc.Dial("localhost:8081", grpc.WithTransportCredentials(insecure.NewCredentials()))
	if err != nil {
		log.Fatalf("did not connect: %v", err)
	}
	defer conn.Close()
	client := pb.NewIdentityInfoServiceClient(conn)

	ctx, cancel := context.WithTimeout(context.Background(), time.Second)
	defer cancel()

	in := pb.IdentityInfo{Id: 1,Name: "张三"}
	result,err := client.AddIdentityInfo(ctx,&in)
	if err != nil {
		log.Fatalf("远程调用 AddIdentityInfo 出现错误: %v", err)
	}
	log.Printf("远程调用结果%v",result)

	id := pb.IdentityInfoId{Id: 1}
	info,err := client.GetInfo(ctx,&id)
	if err != nil {
		log.Fatalf("远程调用 GetInfo 出现错误: %v", err)
	}
	log.Printf("远程调用结果%v",info)
}
