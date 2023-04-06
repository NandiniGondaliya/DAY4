import React, { useState } from "react";
import "./App.css";
import pizzaImage from "./pizza.jpg";
import burgerImage from "./burger.jpg";
import friesImage from "./fries.jpg";
import saladImage from "./salad.jpg";

const FOODS = [  { id: 1, name: "Pizza", price: 100, image: pizzaImage, category: "Italian" },  { id: 2, name: "Burger", price: 80, image: burgerImage, category: "American" },  { id: 3, name: "Fries", price: 40, image: friesImage, category: "American" },  { id: 4, name: "Salad", price: 60, image: saladImage, category: "Healthy" },];

const CATEGORIES = ["All", "Italian", "American", "Healthy"];

function App() {
  const [cart, setCart] = useState([]);
  const [total, setTotal] = useState(0);
  const [selectedCategory, setSelectedCategory] = useState("All");

  const handleAddToCart = (food) => {
    const index = cart.findIndex((f) => f.id === food.id);
    if (index !== -1) {
      const newCart = [...cart];
      newCart[index].quantity++;
      setCart(newCart);
      setTotal(total + food.price);
    } else {
      const newCart = [...cart, { ...food, quantity: 1 }];
      setCart(newCart);
      setTotal(total + food.price);
    }
  };

  const handleRemoveFromCart = (food) => {
    const index = cart.findIndex((f) => f.id === food.id);
    const newCart = [...cart];
    const quantity = newCart[index].quantity;
    if (quantity > 1) {
      newCart[index].quantity--;
      setCart(newCart);
      setTotal(total - food.price);
    } else {
      newCart.splice(index, 1);
      setCart(newCart);
      setTotal(total - food.price);
    }
  };

  const handleClearCart = () => {
    setCart([]);
    setTotal(0);
  };

  const handleCategorySelect = (category) => {
    setSelectedCategory(category);
  };

  const filteredFoods =
    selectedCategory === "All"
      ? FOODS
      : FOODS.filter((food) => food.category === selectedCategory);

  return (
    <div className="App">
      <nav>
        <ul className="categories">
          {CATEGORIES.map((category) => (
            <li
              key={category}
              className={category === selectedCategory ? "active" : ""}
              onClick={() => handleCategorySelect(category)}
            >
              {category}
            </li>
          ))}
          <li className="cart-item">
            <button>Cart ({cart.length})</button>
            <div className="cart-dropdown">
              <ul>
                {cart.map((food) => (
                  <li key={food.id}>
                    {food.name} - ₹{food.price} x {food.quantity}
                    <button onClick={() => handleRemoveFromCart(food)}>
                      Remove
                    </button>
                  </li>
                ))}
              </ul>
              <p>Total: ₹ {total}</p>
              <button2 onClick={() => handleClearCart()}>Clear All</button2>
              <button>Checkout</button>
            </div>
          </li>
  
        </ul>
      </nav>
      <h1>Restaurant Food Ordering</h1>
      <div className="menu">
        {filteredFoods.map((food) => (
          <div key={food.id} className="food">
            <img src={food.image} alt={food.name} />
            <h2>{food.name}</h2>
            <p>₹{food.price}</p>
            <button onClick={() => handleAddToCart(food)}>Add to Cart</button>
          </div>
        ))}
      </div>
      <footer>
        &copy; 2023 NANDINI GADHAVI
      </footer>
    </div>
  );
}

export default App;
