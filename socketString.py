import argparse

import socket

def client(ip, port, message):
    # 创建TCP socket对象
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

    # 连接服务器
    server_address = (ip, port)
    client_socket.connect(server_address)

    # 发送消息到服务器
    client_socket.send(message.encode())

    # 接收服务器的响应
    response = client_socket.recv(1024)
    print(response.decode())

    # 关闭连接
    client_socket.close()

def server(ip, port):
    # 创建TCP socket对象
    server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

    # 绑定socket对象到服务器地址和端口号
    server_address = (ip, port)
    server_socket.bind(server_address)

    # 开始监听客户端连接
    server_socket.listen(1)
    print('Server listening on', server_address)

    while True:
        # 等待客户端连接
        client_socket, client_address = server_socket.accept()
        print('Received connection from', client_address)

        # 接收客户端消息
        message = client_socket.recv(1024)
        print(message.decode())

        # 发送响应消息到客户端
        response = 'Hello, client!'
        client_socket.send(response.encode())

        # 关闭连接
        client_socket.close()

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Simple client-server program")
    parser.add_argument("-t", "--type", required=True, choices=["client", "server"], help="The type of the program [client, server]")
    parser.add_argument("-i", "--ip", required=True, help="The IP address of the server")
    parser.add_argument("-p", "--port", required=True, type=int, help="The port number of the server")
    parser.add_argument("-m", "--message", help="The message to be sent to the server")

    args = parser.parse_args()

    if args.type == "client":
        if args.message:
            message = args.message
        else:
            message = "Hello, World!"
        client(args.ip, args.port, message)
    elif args.type == "server":
        server(args.ip, args.port)