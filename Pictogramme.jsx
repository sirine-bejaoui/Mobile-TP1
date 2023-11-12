import React from 'react';
import Icone from './Icone';

export default function Pictogramme(props) {
  const [message, setMessage] = React.useState("Bonne découverte des composants React");

  const handleClick = () => {
    setMessage("Premier défi réussi !");
  };

  return (
    <div>
      {/* Inclut le sous-composant LikeIcon à l'intérieur du composant Like*/}
      <Icone />
      <hr />
      <div>
        <button
          type="button"
          className="btn no-outline btn-secondary"
          onClick={handleClick}
        >
          <i className="fa fa-thumbs-o-up fa-4 align-middle" aria-hidden="true"></i>
          &nbsp;
          <span className="align-middle">J'aime</span>
        </button>
      </div>
      <p>{message}</p>
    </div>
  );
}

