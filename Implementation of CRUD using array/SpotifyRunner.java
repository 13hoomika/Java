class SpotifyRunner{
	public static void main(String ArtistOnSpotify[]){
		boolean List = Spotify.giveArtists("Taylor Swift");
		System.out.println("Artists added to list - "+ List);
		
		List = Spotify.giveArtists("Drake");
		System.out.println("Artists added to list - "+ List);
		
		List = Spotify.giveArtists("The Weeknd");
		System.out.println("Artists added to list - "+ List);
		
		List = Spotify.giveArtists("Ed Sheeran");
		System.out.println("Artists added to list - "+ List);
			
		List = Spotify.giveArtists("Eminem");
		System.out.println("Artists added to list - "+ List);
		
		List = Spotify.giveArtists("Stray Kids");
		System.out.println("Artists added to list - "+ List);
		
		List = Spotify.giveArtists("BTS");
		System.out.println("Artists added to list - "+ List);
		
		List = Spotify.giveArtists("Billie Eilish");
		System.out.println("Artists added to list - "+ List);
				
		Spotify.getArtists();
		
		boolean update = Spotify.updateArtists("ColdPlay","Drakes");
		System.out.println("Artist name updated: " + update);
		
		Spotify.getArtists();
		
		boolean delete = Spotify.deleteByName("Eminem");
		System.out.println("Deleted "+ delete);
		
		Spotify.getNewArr();
	}
}