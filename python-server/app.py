from flask import Flask
port = 8081
app = Flask(__name__)

@app.route('/')
def home():
    return "<h1>Hello from PYTHON Server.</h1>"

if __name__ == '__main__':
    app.run(host="0.0.0.0", port=port, debug=True)
