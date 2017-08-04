#==== Mac layer 0
# remaps
# capslock to ctrl
# lctrl to lcaps
# lalt to lwin
# ralt to rwin
# rctrl to ralt
ifselect 1
remapblock
    CAPS_LOCK LCTRL
    LCTRL CAPS_LOCK
    LALT LGUI
    RALT RGUI
    RCTRL RALT
endblock

#===== Win layer 1
# remaps
# capslock to ctrl
# lctrl to lcaps
ifselect 2
remapblock
layer 0
    CAPS_LOCK LCTRL
    LCTRL CAPS_LOCK
    LALT LALT
    RALT RALT
    RCTRL RCTRL
endblock

#===== Selection layers
# F11 for Mac
# F12 for Win
ifselect any
remapblock 
    F11 SELECT_1
endblock

ifselect any
remapblock 
    F12 SELECT_2
endblock
