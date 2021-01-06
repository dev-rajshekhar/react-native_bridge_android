/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */

import React, {useState} from 'react';
import {
  SafeAreaView,
  View,
  Text,
  StatusBar,
  Button,
  TouchableOpacity,
} from 'react-native';

import {NativeModules, requireNativeComponent} from 'react-native';
const {ToastModule, DeviceInfoModule} = NativeModules;

const GradientView = requireNativeComponent('GradientView');

const App = () => {
  const [deviceSerialName, setDeviceSerialName] = useState('');
  const showToast = () => {
    console.log('===showToast');
    ToastModule.showToast('This toast is from Android');
    DeviceInfoModule.getDeviceSerialName((serial) => {
      console.log(serial);
      setDeviceSerialName(serial);
    });
  };
  return (
    <>
      <StatusBar barStyle="dark-content" />
      <SafeAreaView style={{flex: 1, justifyContent: 'center'}}>
        <GradientView style={{flex: 1}} fromColor="#5f2c82" toColor="#49a09d" />
        <View
          style={{
            flex: 1,
            marginVertical: 10,
            width: '100%',
            position: 'absolute',
            alignItems: 'center',
            justifyContent: 'center',
          }}>
          <Text>Serial Name:{deviceSerialName}</Text>

          <TouchableOpacity
            style={{
              width: 240,
              height: 45,
              justifyContent: 'center',
              alignItems: 'center',
              marginVertical: 10,
              backgroundColor: '#EC6F66',
            }}
            title="HI"
            onPress={() => {
              showToast();
            }}>
            <Text style={{color: 'white'}}>Hello</Text>
          </TouchableOpacity>
        </View>
      </SafeAreaView>
    </>
  );
};

export default App;
