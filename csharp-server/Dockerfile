FROM mcr.microsoft.com/dotnet/sdk:8.0-alpine
WORKDIR /home/csharp/app
COPY server.csproj .
COPY app.cs .
EXPOSE 8080
CMD ["dotnet", "run"]