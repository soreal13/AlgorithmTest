
#박스안의 박스안에 담긴 키 찾기!

#첫번째 방법
def look_for_key(main_box):
    pile = main_box.make_a_pile_to_look_through()
    while pile is not empty:
        box = pile.grab_a_box()
        for item in box:
            if item.is_a_box():
                pile.append(item)
            elif item.is_a_key():
                print ("열쇠를 찾았어요!")

#두번째 방법 재귀(recursion)
def look_for_key(box):
    for item in box:
        if item.is_a_box():
            look_for_key(item) #반복
        elif item.is_a_key():
            print ("열쇠를 찾았어요!")
