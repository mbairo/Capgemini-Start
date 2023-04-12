import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom'
import Home from './pages/home';
import Sobre from './pages/sobre';
import Contato from './pages/contato';
import Blog from './pages/blog';
import Hello from './pages/Hello-brave-new-world';


ReactDOM.render(
  (
    <Router>
      <App>
        <switch>
          <Route exact path ="/" component={Home}/>
          <Route exact path ="/sobre" component={Sobre}/>
          <Route exact path ="/contato" component={Contato}/>
          <Route exact path ="/Blog" component={Blog}/>
          <Route exact path ="/Hello-brave-new-world" component={Hello}/>
        </switch>  
      </App>  
    </Router>
  ),
  document.getElementById('root')
);


