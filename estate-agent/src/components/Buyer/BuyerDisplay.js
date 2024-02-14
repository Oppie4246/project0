import React, { useState, useEffect } from "react";



// function to update existing buyer - need to be able to get buyer by ID display the details then get new input from user into newData:

// const [newData, editForm] = useState({});

// function editBuyer (e) {
//   fetch("http://localhost:8000/buyers", {
//     method: "PATCH",
//     headers: {
//       "Content-Type": "application/json",
//     },
//     body: JSON.stringify(newData),
//   })
//   .then((response) => response.json())
//   .then((data) => console.log(data))
//   .catch((error) => console.error(error));
// }





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
          <p>{`Buyer ID: ${post.id}`}</p>
          <p>{`First Name: ${post.firstname}`}</p>
          <p>{`Surname: ${post.surname}`}</p>
          <p>{`Email: ${post.email}`}</p>
          <p>{`Telephone: ${post.telephone}`}</p>
          <br></br>
          {/* <input onInput={e=>setForm({...newData, firstname: e.target.value})}/> */}
          {/* <button onClick={editBuyer()}>Edit</button> */}
          <br></br>
        </div>

      ))}
    </div>
  );
};

export default App;