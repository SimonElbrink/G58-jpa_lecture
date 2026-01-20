```mermaid

erDiagram
    STUDENT {
        VARCHAR id PK "NN"
        VARCHAR(50) first_name "NN"
        VARCHAR(50) last_name "NN"
        VARCHAR email UK "NN"
        BOOLEAN status "DF = false"
        TIMESTAMP create_date "DF = NOW()"
        BIGINT address_id FK, UK
    }

    ADDRESS {
        BIGINT id PK "AI NN"
        VARCHAR street "NN"
        VARCHAR city "NN"
        VARCHAR postal_code "NN"
        VARCHAR country "NN"
    }

%% Relationships
    STUDENT ||--|| ADDRESS: has_address
```