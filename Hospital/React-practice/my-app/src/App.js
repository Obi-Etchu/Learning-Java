import logo from './logo.svg';
import './App.css';
import Accordian from './components/accordian';
import StarRating from './star-rating';

function App() {
  return (
    <div className="App">
      <Accordian/>
      {/* <StarRating noOfStars={10}/> */}
    </div>
  );
}

export default App;
