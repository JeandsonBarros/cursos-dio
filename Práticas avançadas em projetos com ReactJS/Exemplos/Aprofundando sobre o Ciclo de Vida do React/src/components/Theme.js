import { createContext } from "react"

export const themes = {
    primary: {
        background: "#333",
        color: "#fff"
    },
    secondary: {
        background: "#fff",
        color: "#333"
    },
}

export const ThemeContext = createContext(themes.primary)