# Co 1 mang phan tu, tim phan tu xuat hien
array = ['x', 0, 123, "123", nil, true]
n = array.length
key = 123

for i in 0..n-1 do
	if array[i] == key
		puts 'Found at' + i.to_s + ' - Value ' + array[i].to_s
	end
end