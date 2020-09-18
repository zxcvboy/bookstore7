    using { sap.capire.bookstore7 as db } from '../db/schema';

    // Define Books Service
    service BooksService {
        entity Books as projection   on db.Books { *, category as genre } excluding { category, createdBy, createdAt, modifiedBy, modifiedAt };
        entity Authors as projection on db.Authors;
    }

    // Define Orders Service
    service OrdersService {
        entity Orders as projection on db.Orders;
        entity OrderItems as projection on db.OrderItems;
        // OrderItems are auto exposed
    }

    // Reuse Admin Service
    using { AdminService } from '@sap/capire-products7';
    extend service AdminService with {
        entity Authors as projection on db.Authors;
    }