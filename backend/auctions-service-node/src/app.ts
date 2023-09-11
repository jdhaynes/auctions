import express, { Router } from "express";
import routes from "./routes";

const PORT = 8080;
const app = express();

app.use(express.json());

app.use("/auctions", routes);

app.listen(PORT, () => {
  console.log(`Server started at http://localhost:${PORT}`);
});
