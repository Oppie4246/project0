import React, { useState, useEffect } from "react";















const App = () => {
  const [posts, setPosts] = useState([]);

  const getData = () => {
    var requestOptions = {
      method: "GET",
      redirect: "follow",
    };

    fetch("http://localhost:8000/buyers", requestOptions)
      .then((response) => response.json())
      .then((result) => setPosts(result))
      .catch((error) => console.log("error", error));
  };

  useEffect(() => {
    getData();
  }, []);

  return (
    <div>
      {posts.map((post) => (

        <div key={post.buyerID}>
          <p>{`Buyer ID: ${post.buyerID}`}</p>
          <p>{`First Name: ${post.firstname}`}</p>
          <p>{`Surname: ${post.surname}`}</p>
          <p>{`Email: ${post.email}`}</p>
          <p>{`Telephone: ${post.telephone}`}</p>
          <br></br>
        </div>

      ))}
    </div>
  );
};

export default App;