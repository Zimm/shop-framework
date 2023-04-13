import React from "react";
import { createRoot } from "react-dom/client";
import { BrowserRouter } from "react-router-dom";
import { GlobalProvider } from "./context/GlobalState";

import App from "./App";
import * as serviceWorker from "./serviceWorker";

const container = document.getElementById("root");
const root = createRoot(container);

root.render(
    <GlobalProvider>
    <BrowserRouter>
    <App />
    </BrowserRouter>
    </GlobalProvider>
  
);

serviceWorker.unregister();
