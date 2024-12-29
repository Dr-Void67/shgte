local Rayfield = loadstring(game:HttpGet('https://sirius.menu/rayfield'))()

local Window = Rayfield:CreateWindow({
       Name = "Lok1.gay Invoker",
   Icon = 0, -- Icon in Topbar. Can use Lucide Icons (string) or Roblox Image (number). 0 to use no icon (default).
   LoadingTitle = "Lok1.gay",
   LoadingSubtitle = "made by cyn",
   Theme = "Ocean", -- Check https://docs.sirius.menu/rayfield/configuration/themes

   DisableRayfieldPrompts = false,
   DisableBuildWarnings = false, -- Prevents Rayfield from warning when the script has a version mismatch with the interface

   ConfigurationSaving = {
      Enabled = true,
      FolderName = nil, -- Create a custom folder for your hub/game
      FileName = "Big Hub"
   },

   Discord = {
      Enabled = true, -- Prompt the user to join your Discord server if their executor supports it
      Invite = "p9GaSBEZ5K", -- The Discord invite code, do not include discord.gg/. E.g. discord.gg/ABCD would be ABCD
      RememberJoins = true -- Set this to false to make them join the discord every time they load it up
   },

   KeySystem = true, -- Set this to true to use our key system
   KeySettings = {
      Title = "Key sys",
      Subtitle = "Key System",
      Note = "DM averyfunnyguywhoreallylovescats discord", -- Use this to tell the user how to get a key
      FileName = "3343213314443124343333545566665365", -- It is recommended to use something unique as other scripts using Rayfield may overwrite your key file
      SaveKey = false, -- The user's key will be saved, but if you change the key, they will be unable to use your script
      GrabKeyFromSite = false, -- If this is true, set Key below to the RAW site you would like Rayfield to get the key from
      Key = {"ilovelokiinsideme"} -- List of keys that will be accepted by the system, can be RAW file links (pastebin, github etc) or simple strings ("hello","key22")
   }
})

Rayfield:Notify({
   Title = "cool",
   Content = "Cool you inejcted this shit ass garbage",
   Duration = 6.5,
   Image = 13472993735,
})


local MainTab = Window:CreateTab("🏠 Home", 4483362458) -- Title, Image

local Button = MainTab:CreateButton({
   Name = "Basic aimbot",
   Callback = function()
        loadstring(game:HttpGet("https://raw.githubusercontent.com/ttwizz/Open-Aimbot/master/source.lua", true))()
   end,
})

local Slider = MainTab:CreateSlider({
   Name = "Walkspeed",
   Range = {0, 500 },
   Increment = 1,
   Suffix = "idk walk quick?",
   CurrentValue = 16,
   Flag = "freaky", -- A flag is the identifier for the configuration file, make sure every element has a different flag if you're using configuration saving to ensure no overlaps
   Callback = function(Value)
        game.Players.LocalPlayer.Character.Humanoid.WalkSpeed = (Value)
   end,
})


local OtherTab = Window:CreateTab("⚙️ Settings", nil) -- Title, Image

local Section = OtherTab:CreateSection("Settings")

-- tusn off the huguit
local Button = OtherTab:CreateButton({
   Name = "Destroy gui",
   Callback = function()
        Rayfield:Destroy()
   end,
})
