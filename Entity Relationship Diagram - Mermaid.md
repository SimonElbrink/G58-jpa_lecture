```mermaid

erDiagram
    STUDENT {
        VARCHAR id PK "NN"
        VARCHAR(50) first_name "NN"
        VARCHAR(50) last_name "NN"
        VARCHAR email UK "NN"
        BOOLEAN status "DF = false"
        TIMESTAMP create_date "DF = NOW()"
    }


```