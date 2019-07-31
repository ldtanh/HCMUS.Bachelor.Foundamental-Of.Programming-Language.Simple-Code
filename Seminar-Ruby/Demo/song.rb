class Song
	@@plays = 0
	def initialize(name, artist, duration)
		@name = name
		@artist = artist
		@duration = duration
		@play = 0
	end

	def to_s
		"Song : #{@name} - By #{@artist} (#{@duration})"
	end

	def play
		@play += 1
		@@plays += 1
		"This song: #{@name} plays #{@play} times. Class Song plays total #{@@plays} time!"
	end
end

baihat1 = Song.new('Bai Hat 1', 'Tac gia 1', '01:23')
baihat2 = Song.new('Bai Hat 2', 'Tac gia 2', '45:60')

baihat1.play
baihat2.play
baihat1.play
baihat1.play
baihat2.play