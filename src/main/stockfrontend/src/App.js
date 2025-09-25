import logo from './logo.svg';
import './App.css';
import HeaderComponents from './components/HeaderComponents';
import FooterComponents from './components/FooterComponents';
import {BrowserRouter as Router ,Routes,Route} from 'react-router-dom';
import AddStockMemberComponents from './components/AddStockMemberComponents';
import ListStockMemberComponents from './components/ListStockMemberComponents';
function App() {
  return (
    <div className="App">
      <div>
        <Router>
          <HeaderComponents/>
          <div className=''>
            <Routes>
              <Route path='/' element={<ListStockMemberComponents/>}/>
              <Route path='/stockmembers' element={<ListStockMemberComponents/>}/>
              <Route path='/add-stockmembers' element={<AddStockMemberComponents/>}/>
              <Route path='/edit-stockmembers/:id' element={<AddStockMemberComponents/>}/>
            </Routes>
          </div>
          <FooterComponents/>   
        </Router>  
      </div>
    </div>
  );
}

export default App;
