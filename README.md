# Load Balancer Demo

A simple Docker Compose project that runs multiple backend servers and routes traffic to them through an Nginx load balancer.

Each backend returns a small HTML message, so refreshing the browser shows responses from different services.

> Note: This project is for learning and demonstration. The individual backend servers are not optimized for production use.

## Services

The load balancer runs on port `9000` and forwards requests to these backend containers:

| Service | Local Port |
| --- | --- |
| Node.js | `7071` |
| Python | `7072` |
| Spring | `7073` |
| Go | `7074` |
| .NET | `7075` |
| PHP | `7076` |
| Ruby | `7077` |
| Rust | `7078` |
| Kotlin | `7079` |
| C++ | `7080` |

## Requirements

- Docker
- Docker Compose

## Run

Build and start all services:

```bash
docker-compose up --build
```

Open the load balancer in your browser:

```text
http://localhost:9000
```

Refresh the page a few times to see Nginx route requests to different backend servers.

## Stop

Stop the containers:

```bash
docker-compose down
```

## Main Files

- `docker-compose.yaml` defines all backend services and the Nginx container.
- `nginx.conf` configures the upstream backend pool.
- Each `*-server` folder contains one backend implementation.
