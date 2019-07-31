class Song
	def initialize(name, artist, duration)
		@name = name
		@artist = artist
		@duration = duration
	end

	def to_s
		"Song : #{@name} - By #{@artist} (#{@duration})"
	end
end

class Karaoke < Song
	def initialize(name, artist, duration, lyrics)
		super(name, artist, duration)
		@lyrics = lyrics
	end

	def to_s
		super + "   : #{@lyrics}"
	end
end

quocCa = Karaoke.new('Quoc Ca', 'Van Cao', '3:45', 'Doan quan Viet nam di...')
puts quocCa