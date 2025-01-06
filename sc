

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
      local Camera = workspace.CurrentCamera
      local Players = game:GetService("Players")
      local RunService = game:GetService("RunService")
      local UserInputService = game:GetService("UserInputService")
      local TweenService = game:GetService("TweenService")
      local LocalPlayer = Players.LocalPlayer
      local Holding = false
      
      _G.AimbotEnabled = true
      _G.TeamCheck = false -- If set to true then the script would only lock your aim at enemy team members.
      _G.AimPart = "Head" -- Where the aimbot script would lock at.
      _G.Sensitivity = 0 -- How many seconds it takes for the aimbot script to officially lock onto the target's aimpart.
      
      _G.CircleSides = 64 -- How many sides the FOV circle would have.
      _G.CircleColor = Color3.fromRGB(255, 255, 255) -- (RGB) Color that the FOV circle would appear as.
      _G.CircleTransparency = 0.7 -- Transparency of the circle.
      _G.CircleRadius = 80 -- The radius of the circle / FOV.
      _G.CircleFilled = false -- Determines whether or not the circle is filled.
      _G.CircleVisible = true -- Determines whether or not the circle is visible.
      _G.CircleThickness = 0 -- The thickness of the circle.
      
      local FOVCircle = Drawing.new("Circle")
      FOVCircle.Position = Vector2.new(Camera.ViewportSize.X / 2, Camera.ViewportSize.Y / 2)
      FOVCircle.Radius = _G.CircleRadius
      FOVCircle.Filled = _G.CircleFilled
      FOVCircle.Color = _G.CircleColor
      FOVCircle.Visible = _G.CircleVisible
      FOVCircle.Radius = _G.CircleRadius
      FOVCircle.Transparency = _G.CircleTransparency
      FOVCircle.NumSides = _G.CircleSides
      FOVCircle.Thickness = _G.CircleThickness
      
      local function GetClosestPlayer()
        local MaximumDistance = _G.CircleRadius
        local Target = nil
      
        for _, v in next, Players:GetPlayers() do
          if v.Name ~= LocalPlayer.Name then
            if _G.TeamCheck == true then
              if v.Team ~= LocalPlayer.Team then
                if v.Character ~= nil then
                  if v.Character:FindFirstChild("HumanoidRootPart") ~= nil then
                    if v.Character:FindFirstChild("Humanoid") ~= nil and v.Character:FindFirstChild("Humanoid").Health ~= 0 then
                      local ScreenPoint = Camera:WorldToScreenPoint(v.Character:WaitForChild("HumanoidRootPart", math.huge).Position)
                      local VectorDistance = (Vector2.new(UserInputService:GetMouseLocation().X, UserInputService:GetMouseLocation().Y) - Vector2.new(ScreenPoint.X, ScreenPoint.Y)).Magnitude
                      
                      if VectorDistance < MaximumDistance then
                        Target = v
                      end
                    end
                  end
                end
              end
            else
              if v.Character ~= nil then
                if v.Character:FindFirstChild("HumanoidRootPart") ~= nil then
                  if v.Character:FindFirstChild("Humanoid") ~= nil and v.Character:FindFirstChild("Humanoid").Health ~= 0 then
                    local ScreenPoint = Camera:WorldToScreenPoint(v.Character:WaitForChild("HumanoidRootPart", math.huge).Position)
                    local VectorDistance = (Vector2.new(UserInputService:GetMouseLocation().X, UserInputService:GetMouseLocation().Y) - Vector2.new(ScreenPoint.X, ScreenPoint.Y)).Magnitude
                    
                    if VectorDistance < MaximumDistance then
                      Target = v
                    end
                  end
                end
              end
            end
          end
        end
      
        return Target
      end
      
      UserInputService.InputBegan:Connect(function(Input)
        if Input.UserInputType == Enum.UserInputType.MouseButton2 then
          Holding = true
        end
      end)
      
      UserInputService.InputEnded:Connect(function(Input)
        if Input.UserInputType == Enum.UserInputType.MouseButton2 then
          Holding = false
        end
      end)
      
      RunService.RenderStepped:Connect(function()
        FOVCircle.Position = Vector2.new(UserInputService:GetMouseLocation().X, UserInputService:GetMouseLocation().Y)
        FOVCircle.Radius = _G.CircleRadius
        FOVCircle.Filled = _G.CircleFilled
        FOVCircle.Color = _G.CircleColor
        FOVCircle.Visible = _G.CircleVisible
        FOVCircle.Radius = _G.CircleRadius
        FOVCircle.Transparency = _G.CircleTransparency
        FOVCircle.NumSides = _G.CircleSides
        FOVCircle.Thickness = _G.CircleThickness
      
        if Holding == true and _G.AimbotEnabled == true then
          TweenService:Create(Camera, TweenInfo.new(_G.Sensitivity, Enum.EasingStyle.Sine, Enum.EasingDirection.Out), {CFrame = CFrame.new(Camera.CFrame.Position, GetClosestPlayer().Character[_G.AimPart].Position)}):Play()
        end
      end)
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
      Name = "ESP", -- added the comma and the = sign
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

        
