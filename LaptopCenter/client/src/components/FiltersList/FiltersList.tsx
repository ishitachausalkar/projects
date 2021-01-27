import * as React from 'react';
import { List, ListItem } from 'material-ui/List';
import Subheader from 'material-ui/Subheader';
import Checkbox from 'material-ui/Checkbox';
import { IFilters } from '@typings/state/index';
import '@styles/FiltersList.css';

interface Props {
  filters: IFilters;
  setFilter: (name: string, value: string) => void;
}

class FiltersList extends React.Component<Props> {
  handleCheck = (e: React.MouseEvent<HTMLInputElement>) => {
    const { setFilter } = this.props;

    setFilter(e.currentTarget.name, e.currentTarget.value);
  };

  render() {
    const { filters: { checked } } = this.props;

    return (
      <div className="filtersList">
        <List>
          <Subheader>FILTERS</Subheader>
          <ListItem
            className="listItem"
            primaryText="Price"
            initiallyOpen={false}
            primaryTogglesNestedList={true}
            nestedItems={[
              <Checkbox className="checkbox" label="< $500" name="priceRange" value="<500" checked={checked.includes('<500')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="$500 - $750" name="priceRange" value="500-750" checked={checked.includes('500-750')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="$750 - $1000" name="priceRange" value="750-1000" checked={checked.includes('750-1000')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="$1000 >" name="priceRange" value="1000>" checked={checked.includes('1000>')} onCheck={this.handleCheck} />
            ]}
          />
          <ListItem
            className="listItem"
            primaryText="Brand"
            initiallyOpen={false}
            primaryTogglesNestedList={true}
            nestedItems={[
             // <Checkbox className="checkbox" label="Samsung" name="brand" value="samsung" checked={checked.includes('samsung')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="Apple" name="brand" value="apple" checked={checked.includes('apple')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="Dell" name="brand" value="dell" checked={checked.includes('dell')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="HP" name="brand" value="hp" checked={checked.includes('hp')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="Lenovo" name="brand" value="lenovo" checked={checked.includes('lenovo')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="Others" name="brand" value="others" checked={checked.includes('others')} onCheck={this.handleCheck} />,
   
            ]}
          />
          <ListItem
            className="listItem"
            primaryText="Color"
            initiallyOpen={false}
            primaryTogglesNestedList={true}
            nestedItems={[
              <Checkbox className="checkbox" label="Black" name="color" value="black" checked={checked.includes('black')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="White" name="color" value="white" checked={checked.includes('white')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="Grey" name="color" value="grey" checked={checked.includes('grey')} onCheck={this.handleCheck} />
            ]}
          />
          <ListItem
            className="listItem"
            primaryText="OS"
            initiallyOpen={false}
            primaryTogglesNestedList={true}
            nestedItems={[
              <Checkbox className="checkbox" label="Windows" name="os" value="windows" checked={checked.includes('windows')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="MacOs" name="os" value="macOs" checked={checked.includes('macOs')} onCheck={this.handleCheck} />
            ]}
          />
          <ListItem
            className="listItem"
            primaryText="Internal memory"
            initiallyOpen={false}
            primaryTogglesNestedList={true}
            nestedItems={[
              <Checkbox className="checkbox" label="128GB" name="internalMemory" value="128" checked={checked.includes('128')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="256GB" name="internalMemory" value="256" checked={checked.includes('256')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="512GB" name="internalMemory" value="512" checked={checked.includes('512')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="1 TB" name="internalMemory" value="1TB" checked={checked.includes('1TB')} onCheck={this.handleCheck} />
            ]}
          />
          <ListItem
            className="listItem"
            primaryText="RAM"
            initiallyOpen={false}
            primaryTogglesNestedList={true}
            nestedItems={[
              <Checkbox className="checkbox" label="8 GB" name="ram" value="8" checked={checked.includes('8')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="16 GB" name="ram" value="16" checked={checked.includes('16')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="32 GB" name="ram" value="32" checked={checked.includes('32')} onCheck={this.handleCheck} />,
              //<Checkbox className="checkbox" label="6GB" name="ram" value="6" checked={checked.includes('6')} onCheck={this.handleCheck} />
            ]}
          />
          <ListItem
            className="listItem"
            primaryText="Display size"
            initiallyOpen={false}
            primaryTogglesNestedList={true}
            nestedItems={[
              <Checkbox className="checkbox" label="<13''" name="displaySize" value="<13" checked={checked.includes('<13')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="13''" name="displaySize" value="13" checked={checked.includes('13')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="13 - 14''" name="displaySize" value=">13" checked={checked.includes('>13')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="14''" name="displaySize" value="14" checked={checked.includes('14')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label=">14''" name="displaySize" value=">14" checked={checked.includes('>14')} onCheck={this.handleCheck} />,
              //<Checkbox className="checkbox" label="6.3''" name="displaySize" value="6.3" checked={checked.includes('6.3')} onCheck={this.handleCheck} />
            ]}
          />
          <ListItem
            className="listItem"
            primaryText="Display resolution"
            initiallyOpen={false}
            primaryTogglesNestedList={true}
            nestedItems={[
              <Checkbox className="checkbox" label="540x960" name="displayResolution" value="540x960" checked={checked.includes('540x960')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="1080x1920" name="displayResolution" value="1080x1920" checked={checked.includes('1080x1920')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="1125x2436" name="displayResolution" value="1125x2436" checked={checked.includes('1125x2436')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="1440x2560" name="displayResolution" value="1440x2560" checked={checked.includes('1440x2560')} onCheck={this.handleCheck} />,
              //<Checkbox className="checkbox" label="1440x2880" name="displayResolution" value="1440x2880" checked={checked.includes('1440x2880')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="1440x2960" name="displayResolution" value="1440x2960" checked={checked.includes('1440x2960')} onCheck={this.handleCheck} />
            ]}
          />
          <ListItem
            className="listItem"
            primaryText="CPU"
            initiallyOpen={false}
            primaryTogglesNestedList={true}
            nestedItems={[
              <Checkbox className="checkbox" label="Quad Core" name="cpu" value="quad_core" checked={checked.includes('quad_core')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="Hexa Core" name="cpu" value="hexa_core" checked={checked.includes('hexa_core')} onCheck={this.handleCheck} />,
              <Checkbox className="checkbox" label="Octa Core" name="cpu" value="octa_core" checked={checked.includes('octa_core')} onCheck={this.handleCheck} />
            ]}
          />
        </List>
      </div>
    )
  }
};

export default FiltersList;
