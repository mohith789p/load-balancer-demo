const express = require('express');
const app = express();
const port = 8080;

app.get('/', (req, res) => {
  res.send('<h1>Hello from NODE Server.</h1>');
});

app.listen(port, () => {
  console.log(`Server is running on port ${port}`);
});