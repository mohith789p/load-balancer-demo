FROM gcc:13
RUN apt-get update && apt-get install -y git cmake libasio-dev
WORKDIR /app
RUN git clone https://github.com/CrowCpp/Crow.git
COPY app.cpp .
RUN g++ -std=c++17 -I Crow/include app.cpp -o app -lpthread
EXPOSE 8084
CMD ["./app"]