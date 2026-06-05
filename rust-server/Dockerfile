FROM rust:alpine3.23
WORKDIR /home/rust/app
RUN apk add --no-cache musl-dev gcc
COPY . .
RUN cargo build --release
EXPOSE 8080
CMD ["./target/release/rust-server"]
