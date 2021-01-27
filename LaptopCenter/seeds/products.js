const mongoose = require('mongoose');
const Product = require('../models/Product');

const products = [
  {
    info: {
      name: 'MacBook Pro',
      dimensions: '13 inch',
      weight: '2.75 pounds',
      displayType: 'LED-backlit IPS LCD, capacitive touchscreen, 16M colors',
      displaySize: '12.7"',
      displayResolution: '1080 x 1920 pixels',
      os: 'iOS 13',
      cpu: '1.4GHz quad‑core 8th‑generation Intel Core i5 processor',
      internalMemory: '128GB SSD storage',
      ram: '8GB 2133MHz LPDDR3',
      camera: 'Dual: 12 MP (f/1.8, 28mm, OIS) + 12 MP (f/2.8, 57mm)',
      batery: 'Non-removable Li-Ion inbuilt battery (10.28 Wh)',
      color: 'Silver',
      price: 1299,
      photo: '/img/apple3.jpg'
    },
    tags: {
      priceRange: '1000>',
      brand: 'apple',
      color: 'white',
      os: 'macOs',
      internalMemory: '128',
      ram: '8',
      displaySize: '<13',
      displayResolution: '1080x1920',
      camera: '12',
      cpu: 'hexa_core'
    }
  },
  {
    info: {
      name: 'MacBook Air',
      dimensions: '12.8 x 8.94 x 0.68 inches',
      weight: '3 pounds',
      displayType: 'Super AMOLED capacitive touchscreen, 16M colors',
      displaySize: '13"',
      displayResolution: '1125 x 2436 pixels',
      os: 'iOS 11',
      cpu: '1.6GHz dual-core 8th-generation Intel Core i5 processor',
      internalMemory: '256 GB',
      ram: '8GB 2133MHz LPDDR3 memory',
      camera: 'Dual: 12 MP (f/1.8, 28mm) + 12 MP (f/2.4, 52mm)',
      batery: 'Non-removable Li-Ion 2716 mAh battery (10.35 Wh)',
      color: 'Black',
      price: 1300,
      photo: '/img/apple1.jpg'
    },
    tags: {
      priceRange: '1000>',
      brand: 'apple',
      color: 'black',
      os: 'macOs',
      internalMemory: '256',
      ram: '8',
      displaySize: '13',
      displayResolution: '1125x2436',
      camera: '12',
      cpu: 'hexa_core'
    }
  },
  //================
  {
    info: {
      name: 'Asus ROG Zephyrus S GX502',
      dimensions: '14.2 x 9.9 x 0.7 in',
      weight: '4.6 pounds',
      displayType: 'Super LCD5 capacitive touchscreen, 16M colors',
      displaySize: '14"',
      displayResolution: '1440 x 2560 pixels',
      os: 'Windows 10',
      cpu: 'Intel Core i7-9750H',
      internalMemory: '1 TB',
      ram: '16 GB',
      camera: '12 MP (f/1.7, 1.4 µm, Dual Pixel PDAF, 5-axis OIS)',
      batery: 'Non-removable Li-Ion 3000 mAh battery',
      color: 'Ice White',
      price: 1899.99,
      photo: '/img/asus.jpg'
    },
    tags: {
      priceRange: '1000>',
      brand: 'others',
      color: 'white',
      os: 'windows',
      internalMemory: '1TB',
      ram: '16',
      displaySize: '14',
      displayResolution: '1440x2560',
      camera: '12',
      cpu: 'octa_core'
    }
  },
  //=========
  {
    info: {
      name: 'Dell XPS 13',
      dimensions: '11.8 x 8.94 x 0.68 inches',
      weight: '2.7 pounds',
      displayType: 'non touchscreen, 16M colors',
      displaySize: '13.3"',
      displayResolution: '3840 x 2160 pixels',
      os: 'Windows 10',
      cpu: 'Intel Core i7-10710U',
      internalMemory: '512 GB',
      ram: '16 GB',
      camera: 'Single: 20 MP (f/1.6, 27mm)',
      batery: 'Non-removable Li-Po 6710 mAh battery',
      color: 'Titanium Gray',
      price: 1176,
      photo: '/img/dell2.jpg'
    },
    tags: {
      priceRange: '1000>',
      brand: 'dell',
      color: 'grey',
      os: 'windows',
      internalMemory: '512',
      ram: '16',
      displaySize: '>13',
      displayResolution: '1080x1920',
      camera: '12',
      cpu: 'octa_core'
    }
  },
  //=====================
  {
    info: {
      name: 'Lenovo ThinkPad X1 Carbon Gen 7',
      dimensions: '12.7 x 8.6 x 0.59 inches',
      weight: '2.4 pounds',
      displayType: 'IPS-NEO LCD capacitive non touchscreen, 16M colors',
      displaySize: '14"',
      displayResolution: '1080 x 1920 pixels',
      os: 'Windows 10',
      cpu: 'Intel Core i5-8265U',
      internalMemory: '256 GB',
      ram: '8 GB',
      camera: 'Dual: 12 MP (f/2.2, PDAF, OIS)',
      batery: 'Non-removable Li-Ion 3200 mAh battery',
      color: 'Mystic Silver',
      price: 979,
      photo: '/img/thinkpad.jpg'
    },
    tags: {
      priceRange: '750-1000',
      brand: 'lenovo',
      color: 'grey',
      os: 'windows',
      internalMemory: '256',
      ram: '8',
      displaySize: '14',
      displayResolution: '1080x1920',
      camera: '12',
      cpu: 'octa_core'
    }
  },
  //=====================
  {
    info: {
      name: 'Acer Chromebook 514',
      dimensions: '12.7 x 9.1 x 0.7 inches',
      weight: '3.31 pounds',
      displayType: 'IPS LCD capacitive touchscreen, 16M colors',
      displaySize: '14"',
      displayResolution: '1080x1920 pixels',
      os: 'Windows 10',
      cpu: 'Quad-core Intel Pentium N4200',
      internalMemory: '128 GB',
      ram: '8 GB',
      camera: 'Single: 13 MP (f/2.4, no AF)',
      batery: 'Removable Li-Po 3300 mAh battery',
      color: 'Ice Platinum',
      price: 349,
      photo: '/img/acer.jpg'
    },
    tags: {
      priceRange: '<500',
      brand: 'others',
      color: 'grey',
      os: 'windows',
      internalMemory: '128',
      ram: '8',
      displaySize: '14',
      displayResolution: '1080x1920',
      camera: '8',
      cpu: 'quad_core'
    }
  },
  //===============================================
  {
    info: {
      name: 'Apple MacBook Pro 16-Inch',
      dimensions: '14.09 x 9.68 x 0.64 inches',
      weight: '4.3 pounds',
      displayType: '16‑inch (diagonal) LED‑backlit touchscreen, 16M colors',
      displaySize: '16"',
      displayResolution: '1440 x 2880 pixels',
      os: 'macOS',
      cpu: 'Octa-core Intel Core i9-9980HK',
      internalMemory: '1 TB',
      ram: '32 GB',
      camera: 'Dual: 720 Pixel facetime (f/1.6, 1 µm, 3-axis OIS, PDAF) + 13 MP (f/1.9, no AF)',
      batery: 'Non-removable Li-Po 4500 mAh battery',
      color: 'Aurora Black',
      price: 2399,
      photo: '/img/apple2.jpg'
    },
    tags: {
      priceRange: '1000>',
      brand: 'apple',
      color: 'black',
      os: 'macOs',
      internalMemory: '1TB',
      ram: '32',
      displaySize: '>14',
      displayResolution: '1440x2960',
      camera: '16',
      cpu: 'octa_core'
    }
  },
  //=============
  {
    info: {
      name: 'Dell Latitude 7400 2-in-1',
      dimensions: '12.6 x 7.9 x 0.6 inches',
      weight: '2.99 pounds',
      displayType: 'Super AMOLED capacitive touchscreen, 16M colors',
      displaySize: '14"',
      displayResolution: '540 x 960 pixels',
      os: 'Windows 10',
      cpu: 'Quad-core Intel Core i7-8650U',
      internalMemory: '512 GB',
      ram: '16 GB',
      camera: '8 MP (f/2.4, 31mm), autofocus, LED',
      batery: 'Non-removable Li-Ion 4000 mAh battery',
      color: 'Silver',
      price: 1599,
      photo: '/img/dell1.jpg'
    },
    tags: {
      priceRange: '1000>',
      brand: 'dell',
      color: 'grey',
      os: 'windows',
      internalMemory: '512',
      ram: '16',
      displaySize: '14',
      displayResolution: '540x960',
      camera: '8',
      cpu: 'quad_core'
    }
  },
  //========================
  {
    info: {
      name: 'HP Envy 13',
      dimensions: '12.09 x 8.35 x 0.59 inches',
      weight: '2.82 pounds',
      displayType: 'Super AMOLED capacitive touchscreen, 16M colors',
      displaySize: '13.3"',
      displayResolution: '1440 x 2960 pixels',
      os: 'Windows 10',
      cpu: 'Octa-core Intel Core i7-8565U',
      internalMemory: '512 GB',
      ram: '16 GB',
      camera: 'Dual: 12 MP (f/1.7, 26mm, 1/2.5", 1.4 µm) ',
      batery: 'Non-removable Li-Ion 4300 mAh battery',
      color: 'Silver',
      price: 749,
      photo: '/img/envy.jpg'
    },
    tags: {
      priceRange: '500-750',
      brand: 'hp',
      color: 'white',
      os: 'windows',
      internalMemory: '512',
      ram: '16',
      displaySize: '>13',
      displayResolution: '1440x2960',
      camera: '12',
      cpu: 'octa_core'
    }
  },
  //========================
  {
    info: {
      name: 'HP Pavilion Laptop PC Notebook',
      dimensions: '15.09 x 8.35 x 0.59 inches',
      weight: '4.82 pounds',
      displayType: 'Super AMOLED capacitive non touchscreen, 16M colors',
      displaySize: '13.3"',
      displayResolution: '1440 x 2960 pixels',
      os: 'Windows 10',
      cpu: 'Quad-core 7th Gen Intel Core i3-7100U',
      internalMemory: '256 GB',
      ram: '8 GB',
      camera: 'Dual: 12 MP (f/1.7, 26mm, 1/2.5", 1.4 µm) ',
      batery: 'Non-removable Li-Ion 4300 mAh battery',
      color: 'Silver',
      price: 432,
      photo: '/img/pavilion.jpg'
    },
    tags: {
      priceRange: '<500',
      brand: 'hp',
      color: 'grey',
      os: 'windows',
      internalMemory: '256',
      ram: '8',
      displaySize: '>13',
      displayResolution: '1440x2960',
      camera: '12',
      cpu: 'quad_core'
    }
  },
  //=====================
  {
    info: {
      name: 'HP - Spectre x360 2-in-1 15.6',
      dimensions: '12.2 x 8.6 x 0.6 inches',
      weight: '2.8 pounds',
      displayType: 'Super AMOLED capacitive touchscreen, 16M colors',
      displaySize: '13"',
      displayResolution: '1440 x 2960 pixels',
      os: 'Windows 10',
      cpu: 'Octa-core 8th Gen Intel Core i7-8565U',
      internalMemory: '512 GB',
      ram: '16 GB',
      camera: '12 MP (f/1.7, 26mm, 1/2.5", 1.4 µm, Dual Pixel PDAF), phase detection autofocus, OIS',
      batery: 'Non-removable Li-Ion 3000 mAh battery',
      color: 'Midnight Black',
      price: 1200,
      photo: '/img/spectre.jpg'
    },
    tags: {
      priceRange: '1000>',
      brand: 'hp',
      color: 'black',
      os: 'windows',
      internalMemory: '512',
      ram: '16',
      displaySize: '13',
      displayResolution: '1440x2960',
      camera: '12',
      cpu: 'octa_core'
    }
    
  }
];

const seedProducts = () => {
  Product.remove({}, (err) => {
    if(err) {
      console.log(err);
    }
    console.log('PRODUCTS REMOVED');
    products.forEach((product) => {
      Product.create(product, (err, createdProduct) => {
        if(err) {
          console.log(err);
        } else {
          console.log('PRODUCT CREATED');
          createdProduct.save();
        }
      })
    })
  })
}

module.exports = seedProducts;