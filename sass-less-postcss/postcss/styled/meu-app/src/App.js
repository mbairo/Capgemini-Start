import React, { Component } from 'react';
import 'primereact/resources/primereact.min.css';
import './App.css';
import Header from  './components/header'
import Footer from  './components/footer'
import {Menubar} from 'primereact/menubar'
import {withRouter} from 'react-router-dom';

import styled from 'styled-components';

const DivMain = styled.h1`
color: black;
font-size:10px;
`;

class App extends Component {
  render() {
    const menuitens = [
      {
        label: 'Home',
        command:() => this.props.history.push('/')
      },
      {
        label: 'Sobre',
        command:() => this.props.history.push('/sobre')
      },
      {
        label: 'Contato',
        command:() => this.props.history.push('/contato')
      },
      {
        label: 'Blog',
        command:() => this.props.history.push('/blog')
      },
      {
        label: 'Hello, brave new world',
        command:() => this.props.history.push('/Hello-brave-new-world')
      }
    ];
      return (
        <div className='App'>
          <Menubar model = {menuitens}/>
          <Header/>
          <DivMain>
            <main>
              <div className='content' id='content'>
                {this.props.childrem}
              </div>
            </main>
          </DivMain>
          <Footer/>
        </div>
      );
  }
}
export default withRouter(App);