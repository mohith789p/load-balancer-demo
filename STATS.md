## Docker Resource Usage

### Total Usage

| Resource   | Size    |
| ---------- | ------- |
| Images     | 9.64 GB |
| Containers | 239 MB  |

### Image Sizes

| Service     | Image Size |
| ----------- | ---------- |
| C++         | 2.59 GB    |
| Kotlin      | 1.81 GB    |
| Rust        | 1.64 GB    |
| .NET        | 987 MB     |
| PHP         | 721 MB     |
| Spring Boot | 585 MB     |
| Ruby        | 477 MB     |
| Go          | 329 MB     |
| Node.js     | 140 MB     |
| Python      | 96.8 MB    |
| Nginx       | 93.6 MB    |

### Notes

* All services are running behind a single Nginx load balancer.
* Images are intentionally unoptimized to keep the Dockerfiles simple.
* The project is designed to compare services written in different programming languages rather than minimize image size.
