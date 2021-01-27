import * as React from 'react';
import '@styles/Faq.css';

const Faq = () => (
  <div className="">
    <h1>FAQs</h1>
    <section className="accordion">
      <input type="radio" name="accordion" id="handle1" checked />
      <h2 className="handle">
        <label htmlFor="handle1">1. What Laptop Store is about?</label>
      </h2>
      <div className="content">
        <p><strong>Overall Impression:</strong> A decidedly hoppy and bitter, moderately strong American pale ale, showcasing modern American or New World hop varieties. The balance is hopforward, with a clean fermentation profile, dryish finish, and clean,  supporting malt allowing a creative range of hop character to shine through.</p>
        <p><strong>History:</strong> The first modern American craft beer example is generally believed to be Anchor Liberty Ale, first brewed in 1975 and using whole Cascade hops; the style has pushed beyond that original beer, which now tastes more like an American Pale Ale in comparison. American-made IPAs from earlier eras were not unknown (particularly the well-regarded Ballantine’s IPA, an oak-aged beer using an old English recipe). This style is based on the modern craft beer examples.</p>
      </div>
      <div className="content">
        <p><strong>Overall Impression:</strong> A decidedly hoppy and bitter, moderately strong American pale ale, showcasing modern American or New World hop varieties. The balance is hopforward, with a clean fermentation profile, dryish finish, and clean,  supporting malt allowing a creative range of hop character to shine through.</p>
        <p><strong>History:</strong> The first modern American craft beer example is generally believed to be Anchor Liberty Ale, first brewed in 1975 and using whole Cascade hops; the style has pushed beyond that original beer, which now tastes more like an American Pale Ale in comparison. American-made IPAs from earlier eras were not unknown (particularly the well-regarded Ballantine’s IPA, an oak-aged beer using an old English recipe). This style is based on the modern craft beer examples.</p>
      </div>
    </section>
    <section className="accordion">
      <input type="radio" name="accordion" id="handle2" />
      <h2 className="handle">
        <label htmlFor="handle2">2. Is the product replaceable?</label>
      </h2>
      <div className="content">
        <p><strong>Overall Impression:</strong> A decidedly hoppy and bitter, moderately strong American pale ale, showcasing modern American or New World hop varieties. The balance is hopforward, with a clean fermentation profile, dryish finish, and clean,  supporting malt allowing a creative range of hop character to shine through.</p>
        <p><strong>History:</strong> The first modern American craft beer example is generally believed to be Anchor Liberty Ale, first brewed in 1975 and using whole Cascade hops; the style has pushed beyond that original beer, which now tastes more like an American Pale Ale in comparison. American-made IPAs from earlier eras were not unknown (particularly the well-regarded Ballantine’s IPA, an oak-aged beer using an old English recipe). This style is based on the modern craft beer examples.</p>
      </div>
      <div className="content">
        <p><strong>Overall Impression:</strong> A decidedly hoppy and bitter, moderately strong American pale ale, showcasing modern American or New World hop varieties. The balance is hopforward, with a clean fermentation profile, dryish finish, and clean,  supporting malt allowing a creative range of hop character to shine through.</p>
        <p><strong>History:</strong> The first modern American craft beer example is generally believed to be Anchor Liberty Ale, first brewed in 1975 and using whole Cascade hops; the style has pushed beyond that original beer, which now tastes more like an American Pale Ale in comparison. American-made IPAs from earlier eras were not unknown (particularly the well-regarded Ballantine’s IPA, an oak-aged beer using an old English recipe). This style is based on the modern craft beer examples.</p>
      </div>
    </section>
  </div>
);

export default Faq;
