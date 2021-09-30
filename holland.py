shouldLoop = True
while (shouldLoop):
  altitude = float(input("\nPlease enter the altitude:\n"))
  isFeet = ("F" in str.upper(input("Is this in (f)eet or (m)eters?\n > "))) # Will assume that any response not containing the letter 'f' is meters
  if (isFeet):
    altitude = altitude*0.3048
  temperature = 15-(0.00649*altitude)
  pressure = 101.29*(((temperature+273.1)/288.08)**5.256)
  density = pressure/(0.2869*(temperature+273.1))
  print(f"\nAt an altitude of {round(altitude, 2)} meters, the temperature is {round(temperature, 2)}°C, the pressure is {round(pressure, 2)} kPa, and the density is {round(density, 2)} kg/m³.")
  # These inputs don't care about case or mispelling, if their target character is entered, they will return true. Otherwise they always return false, including for blank entries which means you can leave blank for the default behavior.
  shouldLoop = ("Y" in str.upper(input("\nRerun this script?\n > ")))

# Forgot to do it until now, here's what I came up with. Your's looks pretty good though! My version just includes some solutions to common issues when coding, like changing types, getting confirmation, and making nice looking outputs. You can learn from it but you definitely don't have to use it, because yours is good too. 