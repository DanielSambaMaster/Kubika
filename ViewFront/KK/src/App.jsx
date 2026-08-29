import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from "./pages/Home";



function App() {
    return (
        <BrowserRouter>

            <Routes>

                <Route path="/" element={<Home />} />

                <Route path="/imoveis" element={<Home />} />

                <Route
                    path="/imovel/:id"
                    element={<Home />}
                />

                <Route
                    path="/favoritos"
                    element={<Home />}
                />

                <Route
                    path="/mensagens"
                    element={   <Home />}
                />

                <Route
                    path="/login"
                    element={<Home />}
                />

                <Route
                    path="/registar"
                    element={<Home />}
                />

                <Route
                    path="/publicar"
                    element={<Home />}
                />

            </Routes>

        </BrowserRouter>
    );
}

export default App;