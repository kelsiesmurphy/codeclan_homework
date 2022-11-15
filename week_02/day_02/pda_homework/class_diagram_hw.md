# E-Commerce Store
These diagrams represents a basic e-commerce store.

## A.D.2

```mermaid
classDiagram

class Categories {
    name: str
    products: list
}

class Product {
    name: str
    description: str
    price: int
    image: imageg
    go_on_sale()
}

class Customer {
    name: str
    dob: date
    purchased_products: list
    purchase()
    create_account()
}

Categories -- Product
Customer -- Product
```

> In this example of a basic E-Commerce clothing site layout, we have a set of categories (for example, Mens, Women, Children, Sports). Each of these categories would have a list of products. These products have a name, description, price and image to display on the site, and a method to call when the item is on sale. Separately, there is a customer class that also has a list of products, specifically ones the customer has purchased in the past. They have a method to create their account, and purchase more products.


## A.D.3

Note: Normally in object diagrams the Title would be as shown below. Due to the way I have built this diagram (Mermaid Markdown in VSCode), I have had to add underscores, and the diagram breaks when given a colon. The correct titles for each section would be as follows:
* Mens: Category
* Brian Johnston: Customer
* Kelly Smith: Customer
* Hat: Product

```mermaid
classDiagram

class Mens_Category {
    name: "Mens"
    products: ["Hat", "T-shirt", "Trousers"]
}

class Hat_Product {
    name: "Hat"
    description: "This dark green baseball cap is made from 100% cotton."
    price: 25
    image: "green_hat.jpg"
}

class Brian_Johnston_Customer {
    name: "Brian Johnston"
    dob: 17/11/1980
    purchased_products: ["T-Shirt", "Hat"]
}

class Kelly_Smith_Customer {
    name: "Kelly Smith"
    dob: 05/03/1980
    purchased_products: ["Hat", "Trousers"]
}

Mens_Category -- Hat_Product
Brian_Johnston_Customer -- Hat_Product
Kelly_Smith_Customer -- Hat_Product
```

> In this example of a basic E-Commerce clothing site object diagram, we have the category Hat (of type product). This is linked to both the category of Mens (as one of the products under this category), and linked to the customer Brian Johnston (as one of the products Brian Johnston has purchased previously). Another customer named Kelly Smith has also purchased the hat, therefore those are also linked.