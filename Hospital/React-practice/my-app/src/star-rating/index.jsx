import { useState } from 'react';
import { FaStar } from 'react-icons/fa';

export default function StarRating({ noOfStars = 5 }) {
  const [rating, setRating] = useState(0);
  const [hover, setHover] = useState(0);

  function handleClick(index) {
    console.log(index);
    setRating(index); // Set the rating state
  }

  function handleMouseEnter(index) {
    console.log(index);
    setHover(index); // Set the hover state
  }

  function handleMouseLeave() {
    console.log('Mouse left');
    setHover(0); // Reset the hover state
  }

  return (
    <div className="star-rating">
      {[...Array(noOfStars)].map((_, index) => {
        index += 1;
        return (
          <FaStar
            key={index}
            size={40}
            color={index <= (hover || rating) ? '#ffc107' : '#e4e5e9'}
            onClick={() => handleClick(index)}
            onMouseEnter={() => handleMouseEnter(index)}
            onMouseLeave={handleMouseLeave}
            style={{ cursor: 'pointer', transition: 'color 200ms' }}
          />
        );
      })}
    </div>
  );
}
