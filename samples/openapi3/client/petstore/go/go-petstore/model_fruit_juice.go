/*
OpenAPI Petstore

This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package petstore

import (
	"encoding/json"
	"fmt"
)

// checks if the FruitJuice type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &FruitJuice{}

// FruitJuice struct for FruitJuice
type FruitJuice struct {
	Fruit GmFruit `json:"fruit"`
	AdditionalProperties map[string]interface{}
}

type _FruitJuice FruitJuice

// NewFruitJuice instantiates a new FruitJuice object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewFruitJuice(fruit GmFruit) *FruitJuice {
	this := FruitJuice{}
	this.Fruit = fruit
	return &this
}

// NewFruitJuiceWithDefaults instantiates a new FruitJuice object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewFruitJuiceWithDefaults() *FruitJuice {
	this := FruitJuice{}
	return &this
}

// GetFruit returns the Fruit field value
func (o *FruitJuice) GetFruit() GmFruit {
	if o == nil {
		var ret GmFruit
		return ret
	}

	return o.Fruit
}

// GetFruitOk returns a tuple with the Fruit field value
// and a boolean to check if the value has been set.
func (o *FruitJuice) GetFruitOk() (*GmFruit, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Fruit, true
}

// SetFruit sets field value
func (o *FruitJuice) SetFruit(v GmFruit) {
	o.Fruit = v
}


func (o FruitJuice) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o FruitJuice) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["fruit"] = o.Fruit

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *FruitJuice) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"fruit",
	}

	// defaultValueFuncMap captures the default values for required properties.
	// These values are used when required properties are missing from the payload.
	defaultValueFuncMap := map[string]func() interface{} {
	}
	var defaultValueApplied bool
	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if value, exists := allProperties[requiredProperty]; !exists || value == "" {
			if _, ok := defaultValueFuncMap[requiredProperty]; ok {
				allProperties[requiredProperty] = defaultValueFuncMap[requiredProperty]()
				defaultValueApplied = true
			}
		}
		if value, exists := allProperties[requiredProperty]; !exists || value == ""{
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	if defaultValueApplied {
		data, err = json.Marshal(allProperties)
		if err != nil{
			return err
		}
	}
	varFruitJuice := _FruitJuice{}

	err = json.Unmarshal(data, &varFruitJuice)

	if err != nil {
		return err
	}

	*o = FruitJuice(varFruitJuice)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(data, &additionalProperties); err == nil {
		delete(additionalProperties, "fruit")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableFruitJuice struct {
	value *FruitJuice
	isSet bool
}

func (v NullableFruitJuice) Get() *FruitJuice {
	return v.value
}

func (v *NullableFruitJuice) Set(val *FruitJuice) {
	v.value = val
	v.isSet = true
}

func (v NullableFruitJuice) IsSet() bool {
	return v.isSet
}

func (v *NullableFruitJuice) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableFruitJuice(val *FruitJuice) *NullableFruitJuice {
	return &NullableFruitJuice{value: val, isSet: true}
}

func (v NullableFruitJuice) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableFruitJuice) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


