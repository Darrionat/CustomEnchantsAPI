# How to utilize CustomEnchantsPlus' API


### Make CustomEnchantsPlus a dependency to your plugin


Within your plugin.yml add
```
softdepend: [CustomEnchantsPlus]
```
If you want CustomEnchantsPlus to be absoloutely nessecary to your plugin do this instead
```
depend: [CustomEnchantsPlus]
```


### Add CustomEnchantsPlus to your Java Project as an external library


### Utilize the API by using the static methods within CustomEnchantsAPI

Example:
```
CustomEnchantsAPI.openGui(player, CustomEnchantGui.ENCHANTER);
```

### It's that simple! Thank you for using CustomEnchantsPlus :)
