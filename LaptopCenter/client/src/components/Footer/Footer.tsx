import * as React from 'react';
import '@styles/Footer.css';
import { Link } from 'react-router-dom';
import FlatButton from 'material-ui/FlatButton';

const Footer = () => (
  <div className="footer">
    <div className="menu">
      <FlatButton
        label="Contact Us"
        containerElement={<Link to="/contact" />}
      />
      <FlatButton
        label="FAQs"
        containerElement={<Link to="/faq" />}
      />
    </div>
  </div>
);

export default Footer;
