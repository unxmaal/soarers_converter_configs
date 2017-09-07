#==== Global


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
	RCTRL RCTRL
	SCROLL_LOCK NUM_LOCK
	NUM_LOCK SCROLL_LOCK
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
	SCROLL_LOCK NUM_LOCK
	NUM_LOCK SCROLL_LOCK
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
endblock