# 💼 Application de gestion de notes de frais

Ce projet est une application complète dans le contexte GSB composée de deux parties :

- **Frontend Angular**
- **Backend Spring Boot (Celui-ci)**

L'objectif est de permettre à des visiteurs de consulter, ajouter, modifier et supprimer leurs fiches de frais. Si le montant d'une fiche dépasse 150€, elle est automatiquement considérée comme une fiche hors forfait.

---

#### 📁 `backend/README.md`
```markdown
# 🛠 Backend — API Spring Boot

Le backend fournit une API REST pour gérer les fiches de frais des visiteurs.

## ✅ Fonctionnalités

- Création automatique des fiches "hors forfait" (si montant > 150 €)
- Mise à jour des fiches (montant, justificatifs, date auto)
- Suppression / Récupération par ID, mois, ou visiteur
- Comptage des visiteurs par région (endpoint API dédié)

## 🧰 Stack utilisée

- Java + Spring Boot
- Spring Data JPA
- MySQL (ou MariaDB)
- Requêtes via Repository

## ▶️ Lancer le backend

```bash
./mvnw spring-boot:run
