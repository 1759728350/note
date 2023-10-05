import socket

# 创建服务器的 Socket 对象
serversocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
host = socket.gethostname()
port = 9999

# 绑定端口号
serversocket.bind((host, port))

# 等待客户端连接
serversocket.listen(5)