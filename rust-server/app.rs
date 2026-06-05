use axum::{response::Html, routing::get, Router};
use tokio::net::TcpListener;

#[tokio::main]
async fn main() {
    let app = Router::new().route("/", get(|| async { Html("<h1>Hello from RUST Server.</h1>") }));
    
    let listener = TcpListener::bind("0.0.0.0:8082").await.unwrap();
    println!("Server successfully listening on 0.0.0.0:8082");
    axum::serve(listener, app).await.unwrap();
}