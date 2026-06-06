#include "crow.h"

int main() {
    crow::SimpleApp app;

    CROW_ROUTE(app, "/")([](){
        auto response = crow::response("<h1>Hello from C++ Server.</h1>");
        response.set_header("Content-Type", "text/html");
        return response;
    });

    app.port(8084).multithreaded().run();
}