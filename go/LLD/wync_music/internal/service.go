package internal

import "fmt"

type State interface {
	Play()
	Pause()
	NextTrack()
	PreviousTrack()
	Stop()
}
