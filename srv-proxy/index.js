"use strict";

const express = require("express");
const proxy = require("@sap/cds-odata-v2-adapter-proxy");

const host = "0.0.0.0";
const port = process.env.PORT || 8080;
const target = process.env.srv_api_url || "http://localhost:4004";

(async () => {
    const app = express();

    // serve odata v2
    app.use(proxy({
        path: "v2",
        target: target,
        model: "./srv.json",
        standalone: true,
        services: {
            "/odata/v4/AdminService/": "AdminService",
            "/odata/v4/OrdersService/": "OrdersService",
            "/odata/v4/BooksService/": "BooksService"
        }
    }));

    // start server
    const server = app.listen(port, host, () => console.info(`app is listing at ${host}:${port} link for local test: http://localhost:${port}`));
    server.on("error", error => console.error(error.stack));
})();
