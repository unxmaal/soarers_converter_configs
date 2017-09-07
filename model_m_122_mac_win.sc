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
    LCTRL FN1
    LALT LGUI
    RALT RGUI
    RCTRL RALT
    EUROPE_2 LSHIFT
    EUROPE_1 ENTER
    BACK_QUOTE ESC
    PAD_PLUS PAD_ENTER
    PAD_ASTERIX PAD_PLUS
    NUM_LOCK PAD_SLASH
    ESC NUM_LOCK
endblock

#===== Win layer 1
# remaps
# capslock to ctrl
# lctrl to lcaps
ifselect 2
remapblock
layer 0
    CAPS_LOCK LCTRL
    LCTRL FN1
    LALT LALT
    RALT RALT
    RCTRL RCTRL
    EUROPE_2 LSHIFT
    EUROPE_1 ENTER
    BACK_QUOTE ESC
    PAD_PLUS PAD_ENTER
    PAD_ASTERIX PAD_PLUS
    NUM_LOCK PAD_SLASH
    ESC NUM_LOCK
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

#===== FN1 layer
layerblock
  FN1 1
endblock

remapblock
layer 1
    RCTRL RALT
    I UP
    J LEFT
    K DOWN
    L RIGHT
    BACK_QUOTE BACK_QUOTE
    BACKSPACE BACKSLASH
endblock