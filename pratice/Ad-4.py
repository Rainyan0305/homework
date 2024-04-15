import math
import pygame
pygame.init()

windowSize = [400 , 300]
screen = pygame.display.set_mode(windowSize)
clock = pygame.time.Clock()

width = 200
height = 200
x = windowSize[0] / 2 - width / 2
y = windowSize[1] / 2 - height / 2
colourcircle = pygame.color.Color("#B15BFF")
coloursquare = pygame.color.Color("#FFBFFF")
white = pygame.color.Color("#F0F0F0")

count = 0

done = False
while not done:
    screen.fill(white)
    pygame.draw.rect(screen , coloursquare , [x , y , width , height])
    width += math.cos(count) * 10
    x -= (math.cos(count) * 10) / 2
    height += math.sin(count) * 10
    y -= (math.sin(count) * 10) / 2
    pygame.draw.ellipse(screen , colourcircle, [x , y , width , height])
    count += 0.5

    pygame.display.flip()
    
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            done = True
        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_ESCAPE:
                done = True
    clock.tick(24)
pygame.quit()