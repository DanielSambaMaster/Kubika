import { BrowserRouter, Routes, Route } from "react-router-dom";

import Home from "./pages/Home";
import Properties from "./pages/Properties";
import PropertyDetails from "./pages/PropertyDetails";
import Favorites from "./pages/Favorites";
import Messages from "./pages/Messages";
import Login from "./pages/Login";
import Register from "./pages/Register";
import PublishProperty from "./pages/PublishProperty";

function App() {
    return (
        <BrowserRouter>

            <Routes>

                <Route path="/" element={<Home />} />

                <Route path="/imoveis" element={<Properties />} />

                <Route
                    path="/imovel/:id"
                    element={<PropertyDetails />}
                />

                <Route
                    path="/favoritos"
                    element={<Favorites />}
                />

                <Route
                    path="/mensagens"
                    element={<Messages />}
                />

                <Route
                    path="/login"
                    element={<Login />}
                />

                <Route
                    path="/registar"
                    element={<Register />}
                />

                <Route
                    path="/publicar"
                    element={<PublishProperty />}
                />

            </Routes>

        </BrowserRouter>
    );
}

export default App;