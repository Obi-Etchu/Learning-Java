import {useState} from 'react';
import data from './data';
import './style.css';

const Accordian = () => {
    const [selected, setSelected]=useState(null);
    const [enableMs, setEnableMs] = useState(false);
    const[multiple, setMultipe]=useState([]);
    
    function handleSingleSelection(getCurrentId){
  console.log(getCurrentId)
  setSelected(getCurrentId===selected? null : getCurrentId)
    }
    return (
        <div className='wrapper'>
            <button>Enable multiselection</button>
            <div className='accordian'>
                {
                    
                    data.map(dataItem => <div className='item'>
                        <div onClick={()=>handleSingleSelection(dataItem.id)} className='title'>
                            <h3>{dataItem.question}</h3>
                            <span>+</span>
                            </div>
                            {
                                selected===dataItem.id ?
                                <div>{dataItem.answer}</div>
                                :null
                            }
                            </div>)
            
                    
                }
            </div>
        </div>
      );
}
 
export default Accordian;