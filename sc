loadstring(game:HttpGet("https://api.luarmor.net/files/v3/loaders/f02929ff218b5f1ee2bb9e3b8e8d4c7c.lua"))()

local MacLib = loadstring(game:HttpGet("https://github.com/biggaboy212/Maclib/releases/latest/download/maclib.txt"))()

local Window = MacLib:Window({
    Title = "Lok1.gay Invoker",
    Subtitle = "Free | V1.00 Beta",
    Size = UDim2.fromOffset(868, 650),
    DragStyle = 2,
    DisabledWindowControls = {},
    ShowUserInfo = true,
    Keybind = Enum.KeyCode.RightShift,
    AcrylicBlur = true,
})

Window:Notify({
    Title = "Lok1 was loaded!",
    Description = "Press LeftShift to minimize it discord invite copied to keyboard",
    Lifetime = 10
})
setclipboard ("https://discord.gg/EXAkEmEh3G")

local TabGroup = Window:TabGroup()

local Tab = TabGroup:Tab({
    Name = "Ragebot"
  })

  local Section = Tab:Section({
    Side = "Left"
  })

Section:Button({
    Name = "Silent AIM", -- added the comma and the = sign
    Callback = function() 
        loadstring(game:HttpGet("https://raw.githubusercontent.com/Dr-Void67/shgte/refs/heads/main/Silent%20Aim"))()
    end -- removed the comma
  })


  local TabGroup = Window:TabGroup()

  local Tab = TabGroup:Tab({
      Name = "Visuals"
    })
  
    local Section = Tab:Section({
      Side = "Left"
    })

    Section:Button({
      Name = "ESP (NOT MY SCRIPT)", -- added the comma and the = sign
      Callback = function() 
          loadstring(game:HttpGet("https://raw.githubusercontent.com/Dr-Void67/shgte/refs/heads/main/universal%20esp"))()
      end -- removed the comma
    })


    local TabGroup = Window:TabGroup()

    local Tab = TabGroup:Tab({
        Name = "Local Player"
      })
    
      local Section = Tab:Section({
        Side = "Left"
      })

      Section:Slider({
        Name = "Walkspeed",
        Default = 16,
        Minimum = 0,
        Maximum = 400,
        DisplayMethod = "Percent",
        Callback = function(Value)
          game.Players.LocalPlayer.Character.Humanoid.WalkSpeed = (Value)
        end,
      }, "WalkspeedSlider")

      Section:Slider({
        Name = "Jump Power",
        Default = 16,
        Minimum = 0,
        Maximum = 400,
        DisplayMethod = "Percent",
        Callback = function(Value)
          game.Players.LocalPlayer.Character.Humanoid.JumpPower = (Value)
        end,
      }, "JumpPowerslider")

      

      local TabGroup = Window:TabGroup()

      local Tab = TabGroup:Tab({
          Name = "Misc"
        })
      
        local Section = Tab:Section({
          Side = "Left"
        })

        
